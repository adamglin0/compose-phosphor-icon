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

public val BoldGroup.`Flashlight-bold`: ImageVector
    get() {
        if (`_flashlight-bold` != null) {
            return `_flashlight-bold`!!
        }
        `_flashlight-bold` = Builder(name = "Flashlight-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 12.0f)
                lineTo(72.0f, 12.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 52.0f, 32.0f)
                lineTo(52.0f, 77.33f)
                arcToRelative(20.12f, 20.12f, 0.0f, false, false, 4.0f, 12.0f)
                lineTo(76.0f, 116.0f)
                lineTo(76.0f, 224.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(180.0f, 116.0f)
                lineToRelative(20.0f, -26.67f)
                arcToRelative(20.12f, 20.12f, 0.0f, false, false, 4.0f, -12.0f)
                lineTo(204.0f, 32.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 184.0f, 12.0f)
                close()
                moveTo(180.0f, 36.0f)
                lineTo(180.0f, 52.0f)
                lineTo(76.0f, 52.0f)
                lineTo(76.0f, 36.0f)
                close()
                moveTo(160.0f, 102.67f)
                arcToRelative(20.12f, 20.12f, 0.0f, false, false, -4.0f, 12.0f)
                lineTo(156.0f, 220.0f)
                lineTo(100.0f, 220.0f)
                lineTo(100.0f, 114.67f)
                arcToRelative(20.12f, 20.12f, 0.0f, false, false, -4.0f, -12.0f)
                lineTo(76.0f, 76.0f)
                lineTo(180.0f, 76.0f)
                close()
                moveTo(140.0f, 120.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_flashlight-bold`!!
    }

private var `_flashlight-bold`: ImageVector? = null
