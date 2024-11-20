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

public val FillGroup.Carrot: ImageVector
    get() {
        if (_carrot != null) {
            return _carrot!!
        }
        _carrot = Builder(name = "Carrot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 80.0f)
                horizontalLineTo(199.44f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, -10.19f, 77.26f)
                curveToRelative(-8.52f, 8.69f, -19.61f, 16.92f, -31.85f, 24.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.91f, -0.59f)
                lineToRelative(-34.84f, -34.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.49f, 0.18f)
                arcToRelative(8.23f, 8.23f, 0.0f, false, false, 0.41f, 11.38f)
                lineToRelative(29.88f, 29.88f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.0f, 6.39f)
                curveTo(95.74f, 214.79f, 53.0f, 228.54f, 46.78f, 230.48f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -21.26f, -21.26f)
                curveToRelative(2.73f, -8.71f, 29.0f, -90.27f, 64.86f, -133.35f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.9f, -0.26f)
                lineToRelative(42.05f, 42.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.71f, -0.43f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, false, -0.6f, -11.1f)
                lineTo(108.08f, 64.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.63f, -6.18f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 67.28f, -2.0f)
                verticalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.54f, -8.0f)
                arcTo(8.18f, 8.18f, 0.0f, false, true, 192.0f, 24.28f)
                verticalLineTo(52.69f)
                lineToRelative(26.34f, -26.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(203.31f, 64.0f)
                horizontalLineToRelative(28.41f)
                arcTo(8.18f, 8.18f, 0.0f, false, true, 240.0f, 71.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 80.0f)
                close()
            }
        }
        .build()
        return _carrot!!
    }

private var _carrot: ImageVector? = null
