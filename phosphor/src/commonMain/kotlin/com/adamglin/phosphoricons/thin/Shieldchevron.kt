package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Shieldchevron: ImageVector
    get() {
        if (_shieldchevron != null) {
            return _shieldchevron!!
        }
        _shieldchevron = Builder(name = "Shieldchevron", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 44.0f)
                horizontalLineTo(48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 51.16f, 24.73f, 82.12f, 45.47f, 99.1f)
                curveToRelative(22.4f, 18.32f, 44.55f, 24.5f, 45.48f, 24.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.1f, 0.0f)
                curveToRelative(0.93f, -0.26f, 23.08f, -6.44f, 45.48f, -24.76f)
                curveToRelative(20.74f, -17.0f, 45.47f, -47.94f, 45.47f, -99.1f)
                verticalLineTo(56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 44.0f)
                close()
                moveTo(169.71f, 204.71f)
                arcTo(132.45f, 132.45f, 0.0f, false, true, 128.0f, 227.82f)
                arcToRelative(132.23f, 132.23f, 0.0f, false, true, -41.71f, -23.11f)
                arcTo(115.08f, 115.08f, 0.0f, false, true, 59.21f, 173.0f)
                lineTo(128.0f, 124.88f)
                lineTo(196.79f, 173.0f)
                arcTo(115.08f, 115.08f, 0.0f, false, true, 169.71f, 204.71f)
                close()
                moveTo(212.0f, 112.0f)
                curveToRelative(0.0f, 20.0f, -3.85f, 38.0f, -11.46f, 53.89f)
                lineToRelative(-70.25f, -49.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.58f, 0.0f)
                lineTo(55.46f, 165.89f)
                curveTo(47.85f, 150.0f, 44.0f, 132.0f, 44.0f, 112.0f)
                verticalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineTo(208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _shieldchevron!!
    }

private var _shieldchevron: ImageVector? = null
