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

public val ThinGroup.`Crane-thin`: ImageVector
    get() {
        if (`_crane-thin` != null) {
            return `_crane-thin`!!
        }
        `_crane-thin` = Builder(name = "Crane-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.06f, 20.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.94f, -0.1f)
                lineTo(103.0f, 84.0f)
                lineTo(32.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 96.0f)
                lineTo(20.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(132.0f, 168.0f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, false, -0.17f, -1.15f)
                lineTo(108.77f, 90.0f)
                lineTo(220.0f, 30.67f)
                lineTo(220.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(200.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 24.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 226.06f, 20.57f)
                close()
                moveTo(101.0f, 92.0f)
                lineToRelative(21.6f, 72.0f)
                lineTo(60.0f, 164.0f)
                lineTo(60.0f, 92.0f)
                close()
                moveTo(32.0f, 92.0f)
                lineTo(52.0f, 92.0f)
                verticalLineToRelative(72.0f)
                lineTo(28.0f, 164.0f)
                lineTo(28.0f, 96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 32.0f, 92.0f)
                close()
                moveTo(120.0f, 204.0f)
                lineTo(32.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(28.0f, 172.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(28.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 120.0f, 204.0f)
                close()
            }
        }
        .build()
        return `_crane-thin`!!
    }

private var `_crane-thin`: ImageVector? = null
