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

public val BoldGroup.`Person-bold`: ImageVector
    get() {
        if (`_person-bold` != null) {
            return `_person-bold`!!
        }
        `_person-bold` = Builder(name = "Person-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.29f, 131.34f)
                lineTo(176.17f, 80.19f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 150.55f, 68.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -45.1f, 0.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 79.83f, 80.19f)
                lineTo(34.71f, 131.34f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 33.7f, 34.16f)
                lineToRelative(6.73f, -5.39f)
                lineTo(61.74f, 211.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 43.74f, 19.69f)
                lineTo(128.0f, 191.9f)
                lineToRelative(22.52f, 38.79f)
                arcToRelative(23.82f, 23.82f, 0.0f, false, false, 13.27f, 11.85f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 194.26f, 211.0f)
                lineToRelative(-13.4f, -50.89f)
                lineToRelative(6.73f, 5.39f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 33.7f, -34.16f)
                close()
                moveTo(128.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 28.0f)
                close()
                moveTo(203.0f, 147.12f)
                lineTo(167.48f, 118.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.11f, 12.42f)
                lineTo(171.27f, 218.0f)
                arcToRelative(12.18f, 12.18f, 0.0f, false, false, 0.73f, 2.0f)
                arcToRelative(10.72f, 10.72f, 0.0f, false, false, -0.5f, -1.0f)
                lineTo(138.38f, 162.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.76f, 0.0f)
                lineTo(84.5f, 219.0f)
                arcToRelative(10.72f, 10.72f, 0.0f, false, false, -0.5f, 1.0f)
                arcToRelative(13.16f, 13.16f, 0.0f, false, false, 0.73f, -2.0f)
                lineToRelative(22.87f, -86.92f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.11f, -12.42f)
                lineTo(53.0f, 147.12f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, -1.0f, 0.87f)
                curveToRelative(0.18f, -0.17f, 0.35f, -0.36f, 0.52f, -0.54f)
                lineTo(97.83f, 96.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.0f, -4.06f)
                horizontalLineToRelative(42.34f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.0f, 4.06f)
                lineToRelative(45.32f, 51.39f)
                curveToRelative(0.17f, 0.18f, 0.34f, 0.37f, 0.52f, 0.54f)
                arcTo(11.5f, 11.5f, 0.0f, false, false, 203.0f, 147.12f)
                close()
            }
        }
        .build()
        return `_person-bold`!!
    }

private var `_person-bold`: ImageVector? = null
