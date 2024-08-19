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

public val LightGroup.Lamppendant: ImageVector
    get() {
        if (_lamppendant != null) {
            return _lamppendant!!
        }
        _lamppendant = Builder(name = "Lamppendant", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 76.05f)
                verticalLineTo(72.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                horizontalLineTo(134.0f)
                verticalLineTo(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineTo(58.0f)
                horizontalLineTo(96.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 82.0f, 72.0f)
                verticalLineToRelative(4.0f)
                arcTo(109.76f, 109.76f, 0.0f, false, false, 18.0f, 176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineTo(90.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 76.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(66.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                arcTo(109.76f, 109.76f, 0.0f, false, false, 174.0f, 76.05f)
                close()
                moveTo(154.0f, 184.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -52.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(52.0f)
                close()
                moveTo(30.18f, 170.0f)
                arcTo(97.76f, 97.76f, 0.0f, false, true, 90.31f, 85.51f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 94.0f, 80.0f)
                verticalLineTo(72.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.69f, 5.54f)
                arcTo(97.76f, 97.76f, 0.0f, false, true, 225.82f, 170.0f)
                close()
            }
        }
        .build()
        return _lamppendant!!
    }

private var _lamppendant: ImageVector? = null
