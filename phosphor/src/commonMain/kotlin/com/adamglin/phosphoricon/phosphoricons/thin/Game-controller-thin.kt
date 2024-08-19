package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Game-controller-thin`: ImageVector
    get() {
        if (`_game-controller-thin` != null) {
            return `_game-controller-thin`!!
        }
        `_game-controller-thin` = Builder(name = "Game-controller-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 108.0f)
                lineTo(152.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(104.0f, 100.0f)
                lineTo(92.0f, 100.0f)
                lineTo(92.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(12.0f)
                lineTo(72.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(84.0f, 108.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(92.0f, 108.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(238.21f, 198.36f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -48.84f, 4.27f)
                lineToRelative(-0.17f, -0.18f)
                lineTo(148.29f, 156.0f)
                lineTo(107.72f, 156.0f)
                lineTo(66.81f, 202.44f)
                lineToRelative(-0.18f, 0.19f)
                arcTo(32.08f, 32.08f, 0.0f, false, true, 44.0f, 212.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -31.5f, -37.56f)
                lineTo(28.87f, 90.21f)
                arcTo(55.87f, 55.87f, 0.0f, false, true, 83.89f, 44.0f)
                lineTo(172.0f, 44.0f)
                arcToRelative(56.07f, 56.07f, 0.0f, false, true, 55.1f, 46.1f)
                arcToRelative(0.29f, 0.29f, 0.0f, false, true, 0.0f, 0.1f)
                lineToRelative(16.37f, 84.16f)
                arcTo(31.86f, 31.86f, 0.0f, false, true, 238.21f, 198.36f)
                close()
                moveTo(172.0f, 148.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, -96.0f)
                lineTo(83.9f, 52.0f)
                arcTo(47.9f, 47.9f, 0.0f, false, false, 36.74f, 91.67f)
                lineTo(20.36f, 175.9f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 19.48f, 27.73f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 21.0f, -6.58f)
                lineToRelative(42.0f, -47.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.0f, -1.36f)
                close()
                moveTo(235.63f, 175.83f)
                lineTo(224.63f, 119.17f)
                arcTo(56.09f, 56.09f, 0.0f, false, true, 172.0f, 156.0f)
                lineTo(159.0f, 156.0f)
                lineToRelative(36.16f, 41.06f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 40.52f, -21.23f)
                close()
            }
        }
        .build()
        return `_game-controller-thin`!!
    }

private var `_game-controller-thin`: ImageVector? = null
