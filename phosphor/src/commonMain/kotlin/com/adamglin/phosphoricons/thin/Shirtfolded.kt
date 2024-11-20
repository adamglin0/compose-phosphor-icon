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

public val ThinGroup.ShirtFolded: ImageVector
    get() {
        if (_shirtFolded != null) {
            return _shirtFolded!!
        }
        _shirtFolded = Builder(name = "ShirtFolded", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 44.0f)
                lineTo(177.66f, 44.0f)
                lineTo(162.83f, 29.17f)
                horizontalLineToRelative(0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 28.0f)
                lineTo(96.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.83f, 1.17f)
                horizontalLineToRelative(0.0f)
                lineTo(78.34f, 44.0f)
                lineTo(56.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 56.0f)
                lineTo(44.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(200.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 44.0f)
                close()
                moveTo(128.0f, 72.79f)
                lineTo(103.47f, 36.0f)
                horizontalLineToRelative(49.06f)
                close()
                moveTo(160.62f, 38.28f)
                lineTo(172.0f, 49.66f)
                lineTo(172.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.3f, 3.63f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, -4.21f, -0.51f)
                lineToRelative(-32.2f, -27.82f)
                close()
                moveTo(84.0f, 49.66f)
                lineTo(95.38f, 38.28f)
                lineToRelative(27.33f, 41.0f)
                lineToRelative(-32.17f, 27.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 84.0f, 104.0f)
                close()
                moveTo(52.0f, 208.0f)
                lineTo(52.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(76.0f, 52.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(11.89f, 11.89f, 0.0f, false, false, 6.91f, 10.87f)
                arcTo(12.08f, 12.08f, 0.0f, false, false, 88.0f, 116.0f)
                arcToRelative(11.88f, 11.88f, 0.0f, false, false, 7.65f, -2.8f)
                lineToRelative(0.06f, 0.0f)
                lineTo(124.0f, 88.74f)
                lineTo(124.0f, 212.0f)
                lineTo(56.0f, 212.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 52.0f, 208.0f)
                close()
                moveTo(204.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(132.0f, 212.0f)
                lineTo(132.0f, 88.74f)
                lineToRelative(28.32f, 24.46f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 168.0f, 116.0f)
                arcToRelative(12.08f, 12.08f, 0.0f, false, false, 5.12f, -1.15f)
                arcTo(11.89f, 11.89f, 0.0f, false, false, 180.0f, 104.0f)
                lineTo(180.0f, 52.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _shirtFolded!!
    }

private var _shirtFolded: ImageVector? = null
