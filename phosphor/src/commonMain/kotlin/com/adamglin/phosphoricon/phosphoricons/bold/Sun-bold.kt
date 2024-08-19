package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Sun-bold`: ImageVector
    get() {
        if (`_sun-bold` != null) {
            return `_sun-bold`!!
        }
        `_sun-bold` = Builder(name = "Sun-bold", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 36.0f)
                lineTo(116.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(140.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(196.0f, 128.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, -68.0f, -68.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, true, 196.0f, 128.0f)
                close()
                moveTo(172.0f, 128.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -44.0f, 44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 172.0f, 128.0f)
                close()
                moveTo(51.51f, 68.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, -17.0f)
                lineToRelative(-12.0f, -12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                close()
                moveTo(51.51f, 187.49f)
                lineTo(39.51f, 199.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(12.0f, -12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, -17.0f)
                close()
                moveTo(196.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.49f, -3.51f)
                lineToRelative(12.0f, -12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineToRelative(-12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 196.0f, 72.0f)
                close()
                moveTo(204.49f, 187.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineToRelative(12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f)
                close()
                moveTo(48.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(20.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(36.0f, 140.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 48.0f, 128.0f)
                close()
                moveTo(128.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 220.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 208.0f)
                close()
                moveTo(236.0f, 116.0f)
                lineTo(220.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
            }
        }
        .build()
        return `_sun-bold`!!
    }

private var `_sun-bold`: ImageVector? = null
