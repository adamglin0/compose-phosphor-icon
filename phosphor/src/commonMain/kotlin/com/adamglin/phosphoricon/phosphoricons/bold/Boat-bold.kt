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

public val BoldGroup.`Boat-bold`: ImageVector
    get() {
        if (`_boat-bold` != null) {
            return `_boat-bold`!!
        }
        `_boat-bold` = Builder(name = "Boat-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.33f, 106.79f)
                lineTo(212.0f, 103.35f)
                lineTo(212.0f, 56.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(140.0f, 36.0f)
                lineTo(140.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(116.0f, 36.0f)
                lineTo(64.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 44.0f, 56.0f)
                verticalLineToRelative(47.35f)
                lineToRelative(-10.33f, 3.44f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -13.67f, 19.0f)
                lineTo(20.0f, 152.0f)
                curveToRelative(0.0f, 64.63f, 100.8f, 90.57f, 105.09f, 91.64f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, false, 5.82f, 0.0f)
                curveTo(135.2f, 242.57f, 236.0f, 216.63f, 236.0f, 152.0f)
                lineTo(236.0f, 125.77f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 222.33f, 106.79f)
                close()
                moveTo(68.0f, 60.0f)
                lineTo(188.0f, 60.0f)
                lineTo(188.0f, 95.35f)
                lineTo(131.79f, 76.62f)
                arcToRelative(11.85f, 11.85f, 0.0f, false, false, -7.58f, 0.0f)
                lineTo(68.0f, 95.35f)
                close()
                moveTo(212.0f, 152.0f)
                curveToRelative(0.0f, 36.69f, -58.08f, 60.43f, -84.0f, 67.59f)
                curveToRelative(-25.94f, -7.17f, -84.0f, -30.9f, -84.0f, -67.59f)
                lineTo(44.0f, 128.65f)
                lineToRelative(72.0f, -24.0f)
                lineTo(116.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 104.65f)
                lineToRelative(72.0f, 24.0f)
                close()
            }
        }
        .build()
        return `_boat-bold`!!
    }

private var `_boat-bold`: ImageVector? = null
