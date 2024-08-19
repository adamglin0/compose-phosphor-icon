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

public val BoldGroup.`Ambulance-bold`: ImageVector
    get() {
        if (`_ambulance-bold` != null) {
            return `_ambulance-bold`!!
        }
        `_ambulance-bold` = Builder(name = "Ambulance-bold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                lineTo(92.0f, 132.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 120.0f)
                close()
                moveTo(256.0f, 120.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(225.94f, 204.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -67.88f, 0.0f)
                lineTo(113.94f, 204.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -67.88f, 0.0f)
                lineTo(32.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(12.0f, 72.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 32.0f, 52.0f)
                lineTo(184.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(26.58f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 18.57f, 12.57f)
                lineToRelative(14.0f, 35.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 256.0f, 120.0f)
                close()
                moveTo(196.0f, 92.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(30.28f)
                lineToRelative(-6.4f, -16.0f)
                close()
                moveTo(36.0f, 180.0f)
                lineTo(46.06f, 180.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 67.88f, 0.0f)
                horizontalLineToRelative(44.12f)
                arcTo(36.32f, 36.32f, 0.0f, false, true, 172.0f, 162.08f)
                lineTo(172.0f, 76.0f)
                lineTo(36.0f, 76.0f)
                close()
                moveTo(92.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 92.0f, 192.0f)
                close()
                moveTo(204.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 204.0f, 192.0f)
                close()
                moveTo(232.0f, 180.0f)
                lineTo(232.0f, 132.0f)
                lineTo(196.0f, 132.0f)
                verticalLineToRelative(24.23f)
                arcTo(36.09f, 36.09f, 0.0f, false, true, 225.94f, 180.0f)
                close()
            }
        }
        .build()
        return `_ambulance-bold`!!
    }

private var `_ambulance-bold`: ImageVector? = null
