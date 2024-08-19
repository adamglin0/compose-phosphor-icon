package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Caretcircledoubleleft: ImageVector
    get() {
        if (_caretcircledoubleleft != null) {
            return _caretcircledoubleleft!!
        }
        _caretcircledoubleleft = Builder(name = "Caretcircledoubleleft", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.57f, 54.42f)
                arcToRelative(104.0f, 104.0f, 0.0f, true, false, 0.0f, 147.15f)
                arcTo(104.17f, 104.17f, 0.0f, false, false, 201.57f, 54.42f)
                close()
                moveTo(117.65f, 154.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.32f, 11.32f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.32f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.32f, 11.32f)
                lineTo(91.29f, 128.0f)
                close()
                moveTo(173.65f, 154.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.32f, 11.32f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.32f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.32f, 11.32f)
                lineTo(147.32f, 128.0f)
                close()
            }
        }
        .build()
        return _caretcircledoubleleft!!
    }

private var _caretcircledoubleleft: ImageVector? = null
