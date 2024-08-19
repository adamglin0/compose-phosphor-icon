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

public val ThinGroup.`Scooter-thin`: ImageVector
    get() {
        if (`_scooter-thin` != null) {
            return `_scooter-thin`!!
        }
        `_scooter-thin` = Builder(name = "Scooter-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 140.0f)
                arcToRelative(31.29f, 31.29f, 0.0f, false, false, -6.24f, 0.62f)
                lineToRelative(-34.0f, -101.88f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 168.0f, 36.0f)
                lineTo(136.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(29.12f)
                lineToRelative(19.0f, 57.14f)
                lineToRelative(-58.0f, 70.86f)
                lineTo(76.0f, 172.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -1.0f, 8.0f)
                horizontalLineToRelative(53.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.09f, -1.46f)
                lineToRelative(56.06f, -68.43f)
                lineToRelative(11.0f, 33.0f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 212.0f, 140.0f)
                close()
                moveTo(44.0f, 196.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 44.0f, 196.0f)
                close()
                moveTo(212.0f, 196.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 212.0f, 196.0f)
                close()
            }
        }
        .build()
        return `_scooter-thin`!!
    }

private var `_scooter-thin`: ImageVector? = null
