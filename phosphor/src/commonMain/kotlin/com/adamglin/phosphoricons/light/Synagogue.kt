package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Synagogue: ImageVector
    get() {
        if (_synagogue != null) {
            return _synagogue!!
        }
        _synagogue = Builder(name = "Synagogue", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.0f, 58.84f)
                lineTo(206.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(194.0f, 58.84f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 178.0f, 80.0f)
                verticalLineToRelative(45.66f)
                lineToRelative(-44.0f, -25.14f)
                lineTo(134.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(28.52f)
                lineTo(78.0f, 125.66f)
                lineTo(78.0f, 80.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 62.0f, 58.84f)
                lineTo(62.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(50.0f, 58.84f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 34.0f, 80.0f)
                lineTo(34.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(118.0f, 176.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 20.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(222.0f, 80.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 206.0f, 58.84f)
                close()
                moveTo(200.0f, 70.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                verticalLineToRelative(26.0f)
                lineTo(190.0f, 106.0f)
                lineTo(190.0f, 80.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 200.0f, 70.0f)
                close()
                moveTo(56.0f, 70.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 66.0f, 80.0f)
                verticalLineToRelative(26.0f)
                lineTo(46.0f, 106.0f)
                lineTo(46.0f, 80.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 56.0f, 70.0f)
                close()
                moveTo(46.0f, 118.0f)
                lineTo(66.0f, 118.0f)
                verticalLineToRelative(92.0f)
                lineTo(46.0f, 210.0f)
                close()
                moveTo(128.0f, 154.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, 22.0f)
                verticalLineToRelative(34.0f)
                lineTo(78.0f, 210.0f)
                lineTo(78.0f, 139.48f)
                lineToRelative(50.0f, -28.57f)
                lineToRelative(50.0f, 28.57f)
                lineTo(178.0f, 210.0f)
                lineTo(150.0f, 210.0f)
                lineTo(150.0f, 176.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 128.0f, 154.0f)
                close()
                moveTo(190.0f, 210.0f)
                lineTo(190.0f, 118.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(92.0f)
                close()
            }
        }
        .build()
        return _synagogue!!
    }

private var _synagogue: ImageVector? = null
