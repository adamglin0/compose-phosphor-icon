package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.93f, 126.3f)
                arcTo(116.43f, 116.43f, 0.0f, false, false, 49.0f, 50.81f)
                arcToRelative(115.45f, 115.45f, 0.0f, false, false, -37.0f, 75.49f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 32.0f, 148.0f)
                horizontalLineToRelative(84.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 72.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(148.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -21.7f)
                close()
                moveTo(100.41f, 124.0f)
                curveToRelative(2.67f, -39.33f, 18.08f, -63.51f, 27.59f, -74.87f)
                curveToRelative(9.52f, 11.39f, 24.92f, 35.56f, 27.59f, 74.87f)
                close()
                moveTo(65.31f, 68.46f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 99.0f, 48.65f)
                curveTo(88.8f, 65.25f, 78.39f, 90.08f, 76.36f, 124.0f)
                horizontalLineTo(36.44f)
                arcTo(91.56f, 91.56f, 0.0f, false, true, 65.31f, 68.46f)
                close()
                moveTo(179.64f, 124.0f)
                curveToRelative(-2.0f, -33.92f, -12.44f, -58.75f, -22.65f, -75.35f)
                arcTo(92.19f, 92.19f, 0.0f, false, true, 219.56f, 124.0f)
                close()
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
