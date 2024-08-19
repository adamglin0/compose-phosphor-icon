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

public val ThinGroup.`Crane-tower-thin`: ImageVector
    get() {
        if (`_crane-tower-thin` != null) {
            return `_crane-tower-thin`!!
        }
        `_crane-tower-thin` = Builder(name = "Crane-tower-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 84.0f)
                lineTo(106.47f, 84.0f)
                lineTo(83.58f, 38.21f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 80.0f, 36.0f)
                lineTo(48.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(44.0f, 84.0f)
                lineTo(24.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(44.0f, 92.0f)
                lineTo(44.0f, 212.0f)
                lineTo(24.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(128.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(108.0f, 212.0f)
                lineTo(108.0f, 92.0f)
                lineTo(212.0f, 92.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(192.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 92.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(52.0f, 44.0f)
                lineTo(77.53f, 44.0f)
                lineToRelative(20.0f, 40.0f)
                lineTo(52.0f, 84.0f)
                close()
                moveTo(52.0f, 212.0f)
                lineTo(52.0f, 156.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(56.0f)
                close()
                moveTo(100.0f, 148.0f)
                lineTo(52.0f, 148.0f)
                lineTo(52.0f, 92.0f)
                horizontalLineToRelative(48.0f)
                close()
            }
        }
        .build()
        return `_crane-tower-thin`!!
    }

private var `_crane-tower-thin`: ImageVector? = null
