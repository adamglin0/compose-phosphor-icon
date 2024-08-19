package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Game-controller-bold`: ImageVector
    get() {
        if (`_game-controller-bold` != null) {
            return `_game-controller-bold`!!
        }
        `_game-controller-bold` = Builder(name = "Game-controller-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 116.0f)
                lineTo(152.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
                moveTo(104.0f, 92.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(100.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                lineTo(72.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(244.76f, 202.94f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -61.0f, 5.35f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.53f, -0.56f)
                lineTo(144.67f, 164.0f)
                lineTo(111.33f, 164.0f)
                lineTo(72.81f, 207.73f)
                curveToRelative(-0.17f, 0.19f, -0.35f, 0.38f, -0.53f, 0.56f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 4.62f, 173.05f)
                arcToRelative(1.18f, 1.18f, 0.0f, false, true, 0.0f, -0.2f)
                lineTo(21.0f, 88.79f)
                arcTo(63.88f, 63.88f, 0.0f, false, true, 83.88f, 36.0f)
                lineTo(172.0f, 36.0f)
                arcToRelative(64.08f, 64.08f, 0.0f, false, true, 62.93f, 52.48f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 0.0f, 0.19f)
                lineToRelative(16.36f, 84.17f)
                arcToRelative(1.77f, 1.77f, 0.0f, false, true, 0.0f, 0.2f)
                arcTo(39.74f, 39.74f, 0.0f, false, true, 244.76f, 202.94f)
                close()
                moveTo(172.0f, 140.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, -80.0f)
                lineTo(83.89f, 60.0f)
                arcTo(39.9f, 39.9f, 0.0f, false, false, 44.62f, 93.06f)
                arcToRelative(1.55f, 1.55f, 0.0f, false, false, 0.0f, 0.21f)
                lineToRelative(-16.34f, 84.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.0f, 18.44f)
                arcToRelative(16.07f, 16.07f, 0.0f, false, false, 13.86f, -4.21f)
                lineTo(96.9f, 144.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.0f, -4.07f)
                close()
                moveTo(227.76f, 177.31f)
                lineTo(220.76f, 141.36f)
                arcToRelative(63.84f, 63.84f, 0.0f, false, true, -44.27f, 22.46f)
                lineToRelative(24.41f, 27.72f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 26.85f, -14.23f)
                close()
            }
        }
        .build()
        return `_game-controller-bold`!!
    }

private var `_game-controller-bold`: ImageVector? = null
