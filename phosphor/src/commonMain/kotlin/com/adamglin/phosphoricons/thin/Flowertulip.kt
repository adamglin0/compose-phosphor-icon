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

public val ThinGroup.FlowerTulip: ImageVector
    get() {
        if (_flowerTulip != null) {
            return _flowerTulip!!
        }
        _flowerTulip = Builder(name = "FlowerTulip", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 52.0f)
                arcToRelative(83.5f, 83.5f, 0.0f, false, false, -37.0f, 8.62f)
                curveToRelative(-14.2f, -26.46f, -40.0f, -39.63f, -41.19f, -40.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 0.0f)
                curveToRelative(-1.14f, 0.57f, -27.0f, 13.74f, -41.19f, 40.2f)
                arcTo(83.5f, 83.5f, 0.0f, false, false, 48.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(44.0f, 96.0f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, false, 80.0f, 83.9f)
                verticalLineToRelative(45.63f)
                lineTo(81.79f, 204.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.58f, 7.16f)
                lineToRelative(48.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 0.0f)
                lineToRelative(48.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, -7.16f)
                lineTo(132.0f, 225.53f)
                lineTo(132.0f, 179.9f)
                arcTo(84.1f, 84.1f, 0.0f, false, false, 212.0f, 96.0f)
                lineTo(212.0f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 208.0f, 52.0f)
                close()
                moveTo(128.0f, 28.56f)
                curveToRelative(5.91f, 3.37f, 25.0f, 15.45f, 36.0f, 35.93f)
                arcToRelative(84.46f, 84.46f, 0.0f, false, false, -36.0f, 45.92f)
                arcTo(84.46f, 84.46f, 0.0f, false, false, 92.0f, 64.49f)
                curveTo(103.0f, 44.07f, 122.1f, 31.94f, 128.0f, 28.56f)
                close()
                moveTo(52.0f, 96.0f)
                lineTo(52.0f, 60.1f)
                arcTo(76.11f, 76.11f, 0.0f, false, true, 124.0f, 136.0f)
                verticalLineToRelative(35.9f)
                arcTo(76.11f, 76.11f, 0.0f, false, true, 52.0f, 96.0f)
                close()
                moveTo(204.0f, 96.0f)
                arcToRelative(76.11f, 76.11f, 0.0f, false, true, -72.0f, 75.9f)
                lineTo(132.0f, 136.0f)
                arcToRelative(76.11f, 76.11f, 0.0f, false, true, 72.0f, -75.9f)
                close()
            }
        }
        .build()
        return _flowerTulip!!
    }

private var _flowerTulip: ImageVector? = null
