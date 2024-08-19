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

public val BoldGroup.`Globe-x-bold`: ImageVector
    get() {
        if (`_globe-x-bold` != null) {
            return `_globe-x-bold`!!
        }
        `_globe-x-bold` = Builder(name = "Globe-x-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, false, 0.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.49f, -21.37f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.25f, -0.2f, -17.55f, -14.39f, -27.9f, -42.63f)
                lineTo(128.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(101.48f, 148.0f)
                arcToRelative(135.88f, 135.88f, 0.0f, false, true, 0.0f, -40.0f)
                horizontalLineToRelative(53.0f)
                arcTo(133.77f, 133.77f, 0.0f, false, true, 156.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(159.0f, 159.0f, 0.0f, false, false, -1.25f, -20.0f)
                horizontalLineToRelative(30.82f)
                arcTo(83.49f, 83.49f, 0.0f, false, true, 212.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(97.79f, 49.64f)
                arcTo(140.82f, 140.82f, 0.0f, false, false, 82.29f, 84.0f)
                lineTo(56.48f, 84.0f)
                arcTo(84.46f, 84.46f, 0.0f, false, true, 97.79f, 49.64f)
                close()
                moveTo(97.79f, 206.36f)
                arcTo(84.46f, 84.46f, 0.0f, false, true, 56.48f, 172.0f)
                lineTo(82.29f, 172.0f)
                arcTo(140.82f, 140.82f, 0.0f, false, false, 97.79f, 206.36f)
                close()
                moveTo(77.25f, 148.0f)
                lineTo(46.43f, 148.0f)
                arcToRelative(83.52f, 83.52f, 0.0f, false, true, 0.0f, -40.0f)
                lineTo(77.25f, 108.0f)
                arcToRelative(160.63f, 160.63f, 0.0f, false, false, 0.0f, 40.0f)
                close()
                moveTo(107.59f, 84.0f)
                arcToRelative(116.61f, 116.61f, 0.0f, false, true, 10.0f, -20.77f)
                arcTo(107.75f, 107.75f, 0.0f, false, true, 128.0f, 49.0f)
                arcToRelative(113.2f, 113.2f, 0.0f, false, true, 20.39f, 35.0f)
                close()
                moveTo(173.71f, 84.0f)
                arcToRelative(140.82f, 140.82f, 0.0f, false, false, -15.5f, -34.36f)
                arcTo(84.46f, 84.46f, 0.0f, false, true, 199.52f, 84.0f)
                close()
                moveTo(224.49f, 176.49f)
                lineTo(209.0f, 192.0f)
                lineToRelative(15.52f, 15.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(192.0f, 209.0f)
                lineToRelative(-15.51f, 15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(175.0f, 192.0f)
                lineToRelative(-15.52f, -15.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(192.0f, 175.0f)
                lineToRelative(15.51f, -15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
            }
        }
        .build()
        return `_globe-x-bold`!!
    }

private var `_globe-x-bold`: ImageVector? = null
