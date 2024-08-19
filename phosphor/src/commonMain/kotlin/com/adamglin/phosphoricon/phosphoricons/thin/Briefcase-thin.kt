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

public val ThinGroup.`Briefcase-thin`: ImageVector
    get() {
        if (`_briefcase-thin` != null) {
            return `_briefcase-thin`!!
        }
        `_briefcase-thin` = Builder(name = "Briefcase-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(112.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 108.0f, 112.0f)
                close()
                moveTo(228.0f, 72.0f)
                verticalLineTo(200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineTo(72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 60.0f)
                horizontalLineTo(84.0f)
                verticalLineTo(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, -20.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineTo(60.0f)
                horizontalLineToRelative(44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 72.0f)
                close()
                moveTo(92.0f, 60.0f)
                horizontalLineToRelative(72.0f)
                verticalLineTo(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(104.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 92.0f, 48.0f)
                close()
                moveTo(36.0f, 72.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(188.0f, 188.0f, 0.0f, false, false, 92.0f, 24.0f)
                arcToRelative(188.0f, 188.0f, 0.0f, false, false, 92.0f, -24.0f)
                verticalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 36.0f, 72.0f)
                close()
                moveTo(220.0f, 200.0f)
                verticalLineTo(125.1f)
                arcTo(196.06f, 196.06f, 0.0f, false, true, 128.0f, 148.0f)
                arcToRelative(196.0f, 196.0f, 0.0f, false, true, -92.0f, -22.9f)
                verticalLineTo(200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineTo(216.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 220.0f, 200.0f)
                close()
            }
        }
        .build()
        return `_briefcase-thin`!!
    }

private var `_briefcase-thin`: ImageVector? = null
