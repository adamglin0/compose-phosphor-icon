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

public val LightGroup.Treasurechest: ImageVector
    get() {
        if (_treasurechest != null) {
            return _treasurechest!!
        }
        _treasurechest = Builder(name = "Treasurechest", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 42.0f)
                lineTo(72.0f, 42.0f)
                arcTo(54.06f, 54.06f, 0.0f, false, false, 18.0f, 96.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(224.0f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(238.0f, 96.0f)
                arcTo(54.06f, 54.06f, 0.0f, false, false, 184.0f, 42.0f)
                close()
                moveTo(226.0f, 96.0f)
                verticalLineToRelative(10.0f)
                lineTo(190.0f, 106.0f)
                lineTo(190.0f, 54.44f)
                arcTo(42.05f, 42.05f, 0.0f, false, true, 226.0f, 96.0f)
                close()
                moveTo(138.0f, 138.0f)
                lineTo(118.0f, 138.0f)
                lineTo(118.0f, 102.0f)
                horizontalLineToRelative(20.0f)
                close()
                moveTo(112.0f, 150.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(150.0f, 118.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(76.0f)
                lineTo(78.0f, 194.0f)
                lineTo(78.0f, 118.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(26.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 112.0f, 150.0f)
                close()
                moveTo(150.0f, 106.0f)
                lineTo(150.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(112.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(10.0f)
                lineTo(78.0f, 106.0f)
                lineTo(78.0f, 54.0f)
                lineTo(178.0f, 54.0f)
                verticalLineToRelative(52.0f)
                close()
                moveTo(66.0f, 54.44f)
                lineTo(66.0f, 106.0f)
                lineTo(30.0f, 106.0f)
                lineTo(30.0f, 96.0f)
                arcTo(42.05f, 42.05f, 0.0f, false, true, 66.0f, 54.44f)
                close()
                moveTo(30.0f, 192.0f)
                lineTo(30.0f, 118.0f)
                lineTo(66.0f, 118.0f)
                verticalLineToRelative(76.0f)
                lineTo(32.0f, 194.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 30.0f, 192.0f)
                close()
                moveTo(224.0f, 194.0f)
                lineTo(190.0f, 194.0f)
                lineTo(190.0f, 118.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(74.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 224.0f, 194.0f)
                close()
            }
        }
        .build()
        return _treasurechest!!
    }

private var _treasurechest: ImageVector? = null
