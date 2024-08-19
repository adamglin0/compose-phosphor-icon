package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Cube-focus-light`: ImageVector
    get() {
        if (`_cube-focus-light` != null) {
            return `_cube-focus-light`!!
        }
        `_cube-focus-light` = Builder(name = "Cube-focus-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 48.0f)
                lineTo(230.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(218.0f, 54.0f)
                lineTo(184.0f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 230.0f, 48.0f)
                close()
                moveTo(72.0f, 202.0f)
                lineTo(38.0f, 202.0f)
                lineTo(38.0f, 168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(72.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(224.0f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(34.0f)
                lineTo(184.0f, 202.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(230.0f, 168.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 162.0f)
                close()
                moveTo(32.0f, 94.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(38.0f, 54.0f)
                lineTo(72.0f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(32.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(26.0f, 88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 32.0f, 94.0f)
                close()
                moveTo(187.0f, 165.21f)
                lineTo(131.0f, 197.21f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 0.0f)
                lineToRelative(-56.0f, -32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 66.0f, 160.0f)
                lineTo(66.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.0f, -5.21f)
                lineToRelative(56.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 0.0f)
                lineToRelative(56.0f, 32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 190.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 187.0f, 165.21f)
                close()
                moveTo(84.09f, 96.0f)
                lineTo(128.0f, 121.09f)
                lineTo(171.91f, 96.0f)
                lineTo(128.0f, 70.91f)
                close()
                moveTo(78.0f, 156.52f)
                lineToRelative(44.0f, 25.14f)
                lineTo(122.0f, 131.48f)
                lineTo(78.0f, 106.34f)
                close()
                moveTo(178.0f, 156.52f)
                lineTo(178.0f, 106.34f)
                lineToRelative(-44.0f, 25.14f)
                verticalLineToRelative(50.18f)
                close()
            }
        }
        .build()
        return `_cube-focus-light`!!
    }

private var `_cube-focus-light`: ImageVector? = null
