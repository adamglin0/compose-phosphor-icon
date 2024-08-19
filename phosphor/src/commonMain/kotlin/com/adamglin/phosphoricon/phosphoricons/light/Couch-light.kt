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

public val LightGroup.`Couch-light`: ImageVector
    get() {
        if (`_couch-light` != null) {
            return `_couch-light`!!
        }
        `_couch-light` = Builder(name = "Couch-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.0f, 107.37f)
                lineTo(238.0f, 72.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(32.0f, 58.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 72.0f)
                verticalLineToRelative(35.37f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 10.0f, 120.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(34.0f, 182.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(46.0f, 182.0f)
                lineTo(210.0f, 182.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(222.0f, 182.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(246.0f, 120.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 238.0f, 107.37f)
                close()
                moveTo(226.0f, 72.0f)
                verticalLineToRelative(34.0f)
                lineTo(216.0f, 106.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(18.0f)
                lineTo(134.0f, 138.0f)
                lineTo(134.0f, 70.0f)
                horizontalLineToRelative(90.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 226.0f, 72.0f)
                close()
                moveTo(32.0f, 70.0f)
                horizontalLineToRelative(90.0f)
                verticalLineToRelative(68.0f)
                lineTo(54.0f, 138.0f)
                lineTo(54.0f, 120.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(30.0f, 106.0f)
                lineTo(30.0f, 72.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 32.0f, 70.0f)
                close()
                moveTo(234.0f, 168.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(24.0f, 170.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(22.0f, 120.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(40.0f, 118.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(208.0f, 150.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(214.0f, 120.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return `_couch-light`!!
    }

private var `_couch-light`: ImageVector? = null
