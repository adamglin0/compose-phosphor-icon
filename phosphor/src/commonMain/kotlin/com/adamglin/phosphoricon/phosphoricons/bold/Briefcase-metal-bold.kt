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

public val BoldGroup.`Briefcase-metal-bold`: ImageVector
    get() {
        if (`_briefcase-metal-bold` != null) {
            return `_briefcase-metal-bold`!!
        }
        `_briefcase-metal-bold` = Builder(name = "Briefcase-metal-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 52.0f)
                lineTo(180.0f, 52.0f)
                lineTo(180.0f, 40.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, -28.0f)
                lineTo(104.0f, 12.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 76.0f, 40.0f)
                lineTo(76.0f, 52.0f)
                lineTo(40.0f, 52.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 72.0f)
                lineTo(20.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 72.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 52.0f)
                close()
                moveTo(44.0f, 120.0f)
                lineTo(212.0f, 120.0f)
                verticalLineToRelative(32.0f)
                lineTo(44.0f, 152.0f)
                close()
                moveTo(100.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(156.0f, 52.0f)
                lineTo(100.0f, 52.0f)
                close()
                moveTo(212.0f, 76.0f)
                lineTo(212.0f, 96.0f)
                lineTo(44.0f, 96.0f)
                lineTo(44.0f, 76.0f)
                close()
                moveTo(44.0f, 196.0f)
                lineTo(44.0f, 176.0f)
                lineTo(212.0f, 176.0f)
                verticalLineToRelative(20.0f)
                close()
            }
        }
        .build()
        return `_briefcase-metal-bold`!!
    }

private var `_briefcase-metal-bold`: ImageVector? = null
