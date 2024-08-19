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

public val ThinGroup.`Park-thin`: ImageVector
    get() {
        if (`_park-thin` != null) {
            return `_park-thin`!!
        }
        `_park-thin` = Builder(name = "Park-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 196.0f)
                lineTo(196.0f, 196.0f)
                lineTo(196.0f, 164.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.88f, -5.0f)
                lineToRelative(-32.0f, -128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.76f, 0.0f)
                lineToRelative(-32.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.88f, 5.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(32.0f)
                lineTo(116.0f, 196.0f)
                lineTo(116.0f, 172.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(116.0f, 164.0f)
                lineTo(116.0f, 140.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(40.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(52.0f, 140.0f)
                verticalLineToRelative(24.0f)
                lineTo(40.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(52.0f, 172.0f)
                verticalLineToRelative(24.0f)
                lineTo(24.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(232.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(192.0f, 48.49f)
                lineTo(218.88f, 156.0f)
                lineTo(165.12f, 156.0f)
                close()
                moveTo(60.0f, 140.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(24.0f)
                lineTo(60.0f, 164.0f)
                close()
                moveTo(60.0f, 172.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(24.0f)
                lineTo(60.0f, 196.0f)
                close()
                moveTo(116.0f, 92.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 92.0f, 68.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 116.0f, 92.0f)
                close()
                moveTo(116.0f, 52.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 116.0f, 52.0f)
                close()
            }
        }
        .build()
        return `_park-thin`!!
    }

private var `_park-thin`: ImageVector? = null
