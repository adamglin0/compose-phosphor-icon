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

public val FillGroup.Needle: ImageVector
    get() {
        if (_needle != null) {
            return _needle!!
        }
        _needle = Builder(name = "Needle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.28f, 43.72f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -56.56f, 0.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.23f, 4.3f)
                curveTo(120.69f, 123.28f, 36.0f, 208.73f, 34.36f, 210.33f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.31f, 11.32f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.86f, -0.87f, 86.83f, -86.31f, 138.32f, -95.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.3f, -2.23f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, -56.56f)
                close()
                moveTo(189.66f, 77.66f)
                lineToRelative(-16.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                close()
            }
        }
        .build()
        return _needle!!
    }

private var _needle: ImageVector? = null
