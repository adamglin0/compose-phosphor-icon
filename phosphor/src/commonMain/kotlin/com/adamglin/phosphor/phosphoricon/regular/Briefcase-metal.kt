package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Briefcase-metal`: ImageVector
    get() {
        if (`_briefcase-metal` != null) {
            return `_briefcase-metal`!!
        }
        `_briefcase-metal` = Builder(name = "Briefcase-metal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 56.0f)
                lineTo(176.0f, 56.0f)
                lineTo(176.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                lineTo(104.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 80.0f, 48.0f)
                verticalLineToRelative(8.0f)
                lineTo(40.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 72.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 56.0f)
                close()
                moveTo(40.0f, 112.0f)
                lineTo(216.0f, 112.0f)
                verticalLineToRelative(48.0f)
                lineTo(40.0f, 160.0f)
                close()
                moveTo(96.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(8.0f)
                lineTo(96.0f, 56.0f)
                close()
                moveTo(216.0f, 72.0f)
                lineTo(216.0f, 96.0f)
                lineTo(40.0f, 96.0f)
                lineTo(40.0f, 72.0f)
                close()
                moveTo(216.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 176.0f)
                lineTo(216.0f, 176.0f)
                verticalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return `_briefcase-metal`!!
    }

private var `_briefcase-metal`: ImageVector? = null
