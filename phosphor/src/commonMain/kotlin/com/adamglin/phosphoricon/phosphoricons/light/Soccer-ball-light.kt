package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Soccer-ball-light`: ImageVector
    get() {
        if (`_soccer-ball-light` != null) {
            return `_soccer-ball-light`!!
        }
        `_soccer-ball-light` = Builder(name = "Soccer-ball-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(205.67f, 173.42f)
                lineTo(169.89f, 173.42f)
                lineTo(159.41f, 159.0f)
                lineToRelative(13.29f, -38.72f)
                lineToRelative(17.0f, -5.51f)
                lineToRelative(27.94f, 21.43f)
                arcTo(89.38f, 89.38f, 0.0f, false, true, 205.67f, 173.42f)
                close()
                moveTo(86.11f, 173.42f)
                lineTo(50.33f, 173.42f)
                arcTo(89.38f, 89.38f, 0.0f, false, true, 38.38f, 136.2f)
                lineToRelative(27.94f, -21.43f)
                lineToRelative(17.0f, 5.51f)
                lineTo(96.59f, 159.0f)
                close()
                moveTo(51.0f, 81.42f)
                lineToRelative(7.24f, 24.41f)
                lineToRelative(-20.0f, 15.34f)
                arcTo(89.47f, 89.47f, 0.0f, false, true, 51.0f, 81.42f)
                close()
                moveTo(107.56f, 154.0f)
                lineTo(95.15f, 117.86f)
                lineTo(128.0f, 95.28f)
                lineToRelative(32.85f, 22.58f)
                lineTo(148.44f, 154.0f)
                close()
                moveTo(197.75f, 105.83f)
                lineTo(205.0f, 81.42f)
                arcToRelative(89.47f, 89.47f, 0.0f, false, true, 12.75f, 39.75f)
                close()
                moveTo(196.09f, 69.21f)
                lineTo(186.0f, 103.35f)
                lineToRelative(-17.0f, 5.53f)
                lineToRelative(-35.0f, -24.0f)
                lineTo(134.0f, 67.16f)
                lineToRelative(30.9f, -21.24f)
                arcTo(90.3f, 90.3f, 0.0f, false, true, 196.09f, 69.21f)
                close()
                moveTo(150.92f, 41.0f)
                lineTo(128.0f, 56.72f)
                lineTo(105.08f, 41.0f)
                arcToRelative(90.22f, 90.22f, 0.0f, false, true, 45.84f, 0.0f)
                close()
                moveTo(91.11f, 45.91f)
                lineTo(122.0f, 67.16f)
                lineTo(122.0f, 84.84f)
                lineToRelative(-35.0f, 24.0f)
                lineToRelative(-17.0f, -5.53f)
                lineTo(59.91f, 69.21f)
                arcTo(90.4f, 90.4f, 0.0f, false, true, 91.11f, 45.91f)
                close()
                moveTo(58.75f, 185.42f)
                lineTo(84.93f, 185.42f)
                lineToRelative(9.19f, 26.0f)
                arcTo(90.37f, 90.37f, 0.0f, false, true, 58.75f, 185.42f)
                close()
                moveTo(108.43f, 215.85f)
                lineTo(95.88f, 180.39f)
                lineTo(106.34f, 166.0f)
                horizontalLineToRelative(43.32f)
                lineToRelative(10.46f, 14.39f)
                lineToRelative(-12.55f, 35.46f)
                arcToRelative(90.14f, 90.14f, 0.0f, false, true, -39.14f, 0.0f)
                close()
                moveTo(161.88f, 211.37f)
                lineTo(171.07f, 185.37f)
                horizontalLineToRelative(26.18f)
                arcTo(90.37f, 90.37f, 0.0f, false, true, 161.88f, 211.37f)
                close()
            }
        }
        .build()
        return `_soccer-ball-light`!!
    }

private var `_soccer-ball-light`: ImageVector? = null
