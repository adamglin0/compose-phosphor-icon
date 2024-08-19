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

public val ThinGroup.`Superset-proper-of-thin`: ImageVector
    get() {
        if (`_superset-proper-of-thin` != null) {
            return `_superset-proper-of-thin`!!
        }
        `_superset-proper-of-thin` = Builder(name = "Superset-proper-of-thin", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 128.0f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, true, -84.0f, 84.0f)
                horizontalLineTo(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 0.0f, -152.0f)
                horizontalLineTo(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(72.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 220.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_superset-proper-of-thin`!!
    }

private var `_superset-proper-of-thin`: ImageVector? = null
