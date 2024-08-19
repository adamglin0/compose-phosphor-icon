package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Briefcase-metal-thin`: ImageVector
    get() {
        if (`_briefcase-metal-thin` != null) {
            return `_briefcase-metal-thin`!!
        }
        `_briefcase-metal-thin` = Builder(name = "Briefcase-metal-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 60.0f)
                horizontalLineTo(172.0f)
                verticalLineTo(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(104.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 84.0f, 48.0f)
                verticalLineTo(60.0f)
                horizontalLineTo(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 72.0f)
                verticalLineTo(200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 60.0f)
                close()
                moveTo(36.0f, 108.0f)
                horizontalLineTo(220.0f)
                verticalLineToRelative(56.0f)
                horizontalLineTo(36.0f)
                close()
                moveTo(92.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineTo(60.0f)
                horizontalLineTo(92.0f)
                close()
                moveTo(40.0f, 68.0f)
                horizontalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(28.0f)
                horizontalLineTo(36.0f)
                verticalLineTo(72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 40.0f, 68.0f)
                close()
                moveTo(216.0f, 204.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(172.0f)
                horizontalLineTo(220.0f)
                verticalLineToRelative(28.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 204.0f)
                close()
            }
        }
        .build()
        return `_briefcase-metal-thin`!!
    }

private var `_briefcase-metal-thin`: ImageVector? = null
