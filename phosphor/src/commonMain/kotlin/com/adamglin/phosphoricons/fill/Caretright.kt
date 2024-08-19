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

public val FillGroup.Caretright: ImageVector
    get() {
        if (_caretright != null) {
            return _caretright!!
        }
        _caretright = Builder(name = "Caretright", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(181.66f, 133.66f)
                lineToRelative(-80.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 208.0f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f)
                lineToRelative(80.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 181.66f, 133.66f)
                close()
            }
        }
        .build()
        return _caretright!!
    }

private var _caretright: ImageVector? = null