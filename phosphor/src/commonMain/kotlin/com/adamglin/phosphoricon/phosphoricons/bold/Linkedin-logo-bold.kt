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

public val BoldGroup.`Linkedin-logo-bold`: ImageVector
    get() {
        if (`_linkedin-logo-bold` != null) {
            return `_linkedin-logo-bold`!!
        }
        `_linkedin-logo-bold` = Builder(name = "Linkedin-logo-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 20.0f)
                lineTo(40.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 40.0f)
                lineTo(20.0f, 216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 236.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 40.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 20.0f)
                close()
                moveTo(212.0f, 212.0f)
                lineTo(44.0f, 212.0f)
                lineTo(44.0f, 44.0f)
                lineTo(212.0f, 44.0f)
                close()
                moveTo(112.0f, 176.0f)
                lineTo(112.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 21.43f, -7.41f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 192.0f, 148.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(168.0f, 148.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(96.0f, 120.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(72.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(68.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 84.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 68.0f, 80.0f)
                close()
            }
        }
        .build()
        return `_linkedin-logo-bold`!!
    }

private var `_linkedin-logo-bold`: ImageVector? = null
