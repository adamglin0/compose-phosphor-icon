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

public val LightGroup.Storefront: ImageVector
    get() {
        if (_storefront != null) {
            return _storefront!!
        }
        _storefront = Builder(name = "Storefront", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.22f, 94.41f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 26.0f, 96.0f)
                verticalLineToRelative(16.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 42.0f, 143.0f)
                lineTo(42.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(208.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(214.0f, 143.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 230.0f, 112.0f)
                lineTo(230.0f, 96.0f)
                arcToRelative(5.91f, 5.91f, 0.0f, false, false, -0.23f, -1.64f)
                lineTo(215.43f, 44.15f)
                arcTo(14.07f, 14.07f, 0.0f, false, false, 202.0f, 34.0f)
                lineTo(54.0f, 34.0f)
                arcTo(14.07f, 14.07f, 0.0f, false, false, 40.57f, 44.15f)
                close()
                moveTo(52.11f, 47.41f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 54.0f, 46.0f)
                lineTo(202.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.92f, 1.45f)
                lineTo(216.05f, 90.0f)
                lineTo(40.0f, 90.0f)
                close()
                moveTo(102.0f, 102.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -52.0f, 0.0f)
                close()
                moveTo(38.0f, 102.0f)
                lineTo(90.0f, 102.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -38.18f, 23.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.65f, -1.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 38.0f, 112.0f)
                close()
                moveTo(202.0f, 210.0f)
                lineTo(54.0f, 210.0f)
                lineTo(54.0f, 148.66f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 42.0f, -16.21f)
                arcToRelative(37.95f, 37.95f, 0.0f, false, false, 64.0f, 0.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 42.0f, 16.21f)
                close()
                moveTo(205.83f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.65f, 1.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 166.0f, 112.0f)
                lineTo(166.0f, 102.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(10.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 205.83f, 134.0f)
                close()
            }
        }
        .build()
        return _storefront!!
    }

private var _storefront: ImageVector? = null
