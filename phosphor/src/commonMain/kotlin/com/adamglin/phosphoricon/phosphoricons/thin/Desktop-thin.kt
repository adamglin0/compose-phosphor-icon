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

public val ThinGroup.`Desktop-thin`: ImageVector
    get() {
        if (`_desktop-thin` != null) {
            return `_desktop-thin`!!
        }
        `_desktop-thin` = Builder(name = "Desktop-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 44.0f)
                horizontalLineTo(48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 64.0f)
                verticalLineTo(176.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(76.0f)
                verticalLineToRelative(24.0f)
                horizontalLineTo(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(132.0f)
                verticalLineTo(196.0f)
                horizontalLineToRelative(76.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 44.0f)
                close()
                moveTo(48.0f, 52.0f)
                horizontalLineTo(208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(84.0f)
                horizontalLineTo(36.0f)
                verticalLineTo(64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 48.0f, 52.0f)
                close()
                moveTo(208.0f, 188.0f)
                horizontalLineTo(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineTo(156.0f)
                horizontalLineTo(220.0f)
                verticalLineToRelative(20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 208.0f, 188.0f)
                close()
            }
        }
        .build()
        return `_desktop-thin`!!
    }

private var `_desktop-thin`: ImageVector? = null
