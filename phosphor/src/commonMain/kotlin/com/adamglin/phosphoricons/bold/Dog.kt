package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Dog: ImageVector
    get() {
        if (_dog != null) {
            return _dog!!
        }
        _dog = Builder(name = "Dog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.0f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 108.0f, 136.0f)
                close()
                moveTo(164.0f, 120.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 164.0f, 120.0f)
                close()
                moveTo(232.24f, 146.18f)
                arcToRelative(20.42f, 20.42f, 0.0f, false, true, -8.41f, 1.85f)
                arcToRelative(19.59f, 19.59f, 0.0f, false, true, -3.83f, -0.39f)
                lineTo(220.0f, 184.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, 44.0f)
                lineTo(80.0f, 228.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, -44.0f)
                lineTo(36.0f, 147.63f)
                arcToRelative(19.0f, 19.0f, 0.0f, false, true, -3.85f, 0.39f)
                arcToRelative(20.31f, 20.31f, 0.0f, false, true, -8.39f, -1.84f)
                arcToRelative(19.71f, 19.71f, 0.0f, false, true, -11.4f, -21.9f)
                lineToRelative(16.42f, -88.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 53.29f, 20.59f)
                lineToRelative(0.47f, 0.13f)
                lineToRelative(52.0f, 15.27f)
                horizontalLineToRelative(44.54f)
                lineToRelative(52.0f, -15.27f)
                lineToRelative(0.47f, -0.13f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 24.51f, 15.72f)
                lineToRelative(16.42f, 88.0f)
                arcTo(19.71f, 19.71f, 0.0f, false, true, 232.24f, 146.18f)
                close()
                moveTo(172.24f, 54.55f)
                lineTo(217.0f, 112.42f)
                lineTo(204.44f, 45.09f)
                close()
                moveTo(39.0f, 112.42f)
                lineTo(83.76f, 54.55f)
                lineToRelative(-32.2f, -9.46f)
                close()
                moveTo(196.0f, 184.0f)
                lineTo(196.0f, 124.48f)
                lineTo(146.11f, 60.0f)
                lineTo(109.89f, 60.0f)
                lineTo(60.0f, 124.48f)
                lineTo(60.0f, 184.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(-7.0f)
                lineToRelative(-12.48f, -12.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(128.0f, 175.0f)
                lineToRelative(7.51f, -7.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(140.0f, 197.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 196.0f, 184.0f)
                close()
            }
        }
        .build()
        return _dog!!
    }

private var _dog: ImageVector? = null
