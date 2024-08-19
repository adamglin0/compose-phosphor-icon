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

public val ThinGroup.`Octagon-thin`: ImageVector
    get() {
        if (`_octagon-thin` != null) {
            return `_octagon-thin`!!
        }
        `_octagon-thin` = Builder(name = "Octagon-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.49f, 83.06f)
                lineTo(172.94f, 31.51f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 164.45f, 28.0f)
                horizontalLineTo(91.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.49f, 3.51f)
                lineTo(31.51f, 83.06f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 91.55f)
                verticalLineToRelative(72.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 3.51f, 8.49f)
                lineToRelative(51.55f, 51.55f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 91.55f, 228.0f)
                horizontalLineToRelative(72.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.49f, -3.51f)
                lineToRelative(51.55f, -51.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 3.51f, -8.49f)
                verticalLineTo(91.55f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.49f, 83.06f)
                close()
                moveTo(220.0f, 164.45f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.17f, 2.83f)
                lineToRelative(-51.55f, 51.55f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.83f, 1.17f)
                horizontalLineTo(91.55f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.83f, -1.17f)
                lineTo(37.17f, 167.28f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 164.45f)
                verticalLineTo(91.55f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.17f, -2.83f)
                lineTo(88.72f, 37.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 91.55f, 36.0f)
                horizontalLineToRelative(72.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.83f, 1.17f)
                lineToRelative(51.55f, 51.55f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 91.55f)
                close()
            }
        }
        .build()
        return `_octagon-thin`!!
    }

private var `_octagon-thin`: ImageVector? = null
