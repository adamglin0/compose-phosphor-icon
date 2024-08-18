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

public val RegularGroup.`Nuclear-plant`: ImageVector
    get() {
        if (`_nuclear-plant` != null) {
            return `_nuclear-plant`!!
        }
        `_nuclear-plant` = Builder(name = "Nuclear-plant", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 32.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                horizontalLineTo(152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 152.0f, 32.0f)
                close()
                moveTo(104.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, -40.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineToRelative(-8.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 96.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 64.0f)
                close()
                moveTo(248.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(32.74f)
                curveToRelative(13.77f, -27.83f, 29.48f, -68.69f, 31.12f, -112.66f)
                arcTo(15.91f, 15.91f, 0.0f, false, true, 79.85f, 80.0f)
                horizontalLineToRelative(88.33f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 15.28f)
                curveToRelative(2.1f, 47.84f, 23.84f, 92.37f, 35.29f, 112.72f)
                horizontalLineTo(240.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 216.0f)
                close()
                moveTo(168.18f, 96.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(1.77f, 43.72f, 17.39f, 84.32f, 31.09f, 112.0f)
                horizontalLineToRelative(18.0f)
                curveTo(188.68f, 184.08f, 170.18f, 141.64f, 168.18f, 96.0f)
                close()
                moveTo(50.5f, 208.0f)
                horizontalLineToRelative(115.0f)
                curveTo(152.0f, 179.09f, 137.77f, 139.09f, 136.15f, 96.0f)
                arcToRelative(7.46f, 7.46f, 0.0f, false, true, -1.0f, -0.06f)
                lineTo(79.85f, 96.0f)
                curveTo(78.24f, 139.06f, 64.06f, 179.07f, 50.5f, 208.0f)
                close()
            }
        }
        .build()
        return `_nuclear-plant`!!
    }

private var `_nuclear-plant`: ImageVector? = null
