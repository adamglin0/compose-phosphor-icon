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

public val ThinGroup.`Bridge-thin`: ImageVector
    get() {
        if (`_bridge-thin` != null) {
            return `_bridge-thin`!!
        }
        `_bridge-thin` = Builder(name = "Bridge-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 164.0f)
                lineTo(196.0f, 164.0f)
                lineTo(196.0f, 88.09f)
                arcToRelative(67.81f, 67.81f, 0.0f, false, false, 34.5f, 31.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 3.0f, -7.42f)
                arcTo(59.77f, 59.77f, 0.0f, false, true, 196.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 68.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                arcToRelative(59.77f, 59.77f, 0.0f, false, true, -37.5f, 55.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, 7.42f)
                arcToRelative(67.81f, 67.81f, 0.0f, false, false, 34.5f, -31.0f)
                lineTo(60.0f, 164.0f)
                lineTo(24.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(60.0f, 172.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(68.0f, 172.0f)
                lineTo(188.0f, 172.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(196.0f, 172.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(148.0f, 121.0f)
                verticalLineToRelative(43.0f)
                lineTo(108.0f, 164.0f)
                lineTo(108.0f, 121.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 40.0f, 0.0f)
                close()
                moveTo(68.0f, 88.0f)
                arcToRelative(68.43f, 68.43f, 0.0f, false, false, 32.0f, 30.0f)
                verticalLineToRelative(46.0f)
                lineTo(68.0f, 164.0f)
                close()
                moveTo(156.0f, 164.0f)
                lineTo(156.0f, 118.0f)
                arcToRelative(68.43f, 68.43f, 0.0f, false, false, 32.0f, -30.0f)
                verticalLineToRelative(76.0f)
                close()
            }
        }
        .build()
        return `_bridge-thin`!!
    }

private var `_bridge-thin`: ImageVector? = null
