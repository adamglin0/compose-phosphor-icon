package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Caretdoubledown: ImageVector
    get() {
        if (_caretdoubledown != null) {
            return _caretdoubledown!!
        }
        _caretdoubledown = Builder(name = "Caretdoubledown", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.66f, 130.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-80.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-80.0f, -80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(128.0f, 204.69f)
                lineToRelative(74.34f, -74.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 213.66f, 130.34f)
                close()
                moveTo(122.34f, 141.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineToRelative(80.0f, -80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineTo(128.0f, 124.69f)
                lineTo(53.66f, 50.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 42.34f, 61.66f)
                close()
            }
        }
        .build()
        return _caretdoubledown!!
    }

private var _caretdoubledown: ImageVector? = null
