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

public val BoldGroup.`Microsoft-outlook-logo-bold`: ImageVector
    get() {
        if (`_microsoft-outlook-logo-bold` != null) {
            return `_microsoft-outlook-logo-bold`!!
        }
        `_microsoft-outlook-logo-bold` = Builder(name = "Microsoft-outlook-logo-bold", defaultWidth
                = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 128.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 124.0f, 128.0f)
                close()
                moveTo(76.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 76.0f, 128.0f)
                close()
                moveTo(224.0f, 100.0f)
                lineTo(212.0f, 100.0f)
                lineTo(212.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(104.0f, 20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 92.0f, 32.0f)
                lineTo(92.0f, 56.0f)
                lineTo(36.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 16.0f, 76.0f)
                lineTo(16.0f, 180.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(68.0f, 200.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 236.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 112.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 100.0f)
                close()
                moveTo(171.55f, 168.0f)
                lineTo(212.0f, 136.54f)
                verticalLineToRelative(62.92f)
                close()
                moveTo(116.0f, 44.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(80.8f)
                lineToRelative(-28.0f, 21.78f)
                lineTo(160.0f, 76.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(116.0f, 56.0f)
                close()
                moveTo(40.0f, 80.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(96.0f)
                lineTo(40.0f, 176.0f)
                close()
                moveTo(92.0f, 200.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 18.28f, -11.92f)
                lineTo(189.0f, 212.0f)
                lineTo(92.0f, 212.0f)
                close()
            }
        }
        .build()
        return `_microsoft-outlook-logo-bold`!!
    }

private var `_microsoft-outlook-logo-bold`: ImageVector? = null
