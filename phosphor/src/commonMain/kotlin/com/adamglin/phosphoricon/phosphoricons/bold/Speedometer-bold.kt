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

public val BoldGroup.`Speedometer-bold`: ImageVector
    get() {
        if (`_speedometer-bold` != null) {
            return `_speedometer-bold`!!
        }
        `_speedometer-bold` = Builder(name = "Speedometer-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(119.51f, 143.51f)
                lineToRelative(88.0f, -88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, 17.0f)
                lineToRelative(-88.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, -17.0f)
                close()
                moveTo(133.74f, 100.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 2.62f, -23.85f)
                arcTo(75.15f, 75.15f, 0.0f, false, false, 128.0f, 76.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, false, -76.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, true, 52.0f, -52.0f)
                arcTo(54.75f, 54.75f, 0.0f, false, true, 133.74f, 100.31f)
                close()
                moveTo(235.28f, 107.81f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 213.09f, 117.0f)
                arcToRelative(92.47f, 92.47f, 0.0f, false, true, 2.58f, 63.0f)
                lineTo(40.34f, 180.0f)
                arcTo(92.23f, 92.23f, 0.0f, false, true, 128.0f, 60.0f)
                horizontalLineToRelative(0.84f)
                arcToRelative(91.43f, 91.43f, 0.0f, false, true, 34.2f, 6.91f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.14f, -22.19f)
                arcTo(116.07f, 116.07f, 0.0f, false, false, 18.57f, 190.58f)
                arcTo(20.09f, 20.09f, 0.0f, false, false, 37.46f, 204.0f)
                lineTo(218.53f, 204.0f)
                arcToRelative(20.06f, 20.06f, 0.0f, false, false, 18.88f, -13.38f)
                arcToRelative(116.39f, 116.39f, 0.0f, false, false, -2.13f, -82.81f)
                close()
            }
        }
        .build()
        return `_speedometer-bold`!!
    }

private var `_speedometer-bold`: ImageVector? = null
