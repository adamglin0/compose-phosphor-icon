package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Hairdryer: ImageVector
    get() {
        if (_hairdryer != null) {
            return _hairdryer!!
        }
        _hairdryer = Builder(name = "Hairdryer", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(168.0f, 32.0f)
                lineTo(30.68f, 54.89f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 62.78f)
                verticalLineToRelative(50.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.68f, 7.89f)
                lineTo(168.0f, 144.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 0.0f, -112.0f)
                close()
                moveTo(168.0f, 112.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 168.0f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 88.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 200.0f, 88.0f)
                close()
                moveTo(168.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 168.0f, 104.0f)
                close()
                moveTo(177.42f, 206.62f)
                lineTo(209.0f, 137.07f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 168.0f, 24.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, -1.32f, 0.11f)
                lineTo(29.37f, 47.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 62.78f)
                verticalLineToRelative(50.44f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 29.37f, 129.0f)
                lineTo(128.0f, 145.44f)
                lineTo(128.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(184.0f, 240.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                horizontalLineToRelative(2.85f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 177.42f, 206.62f)
                close()
                moveTo(32.0f, 62.78f)
                lineTo(168.64f, 40.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 0.0f, 96.0f)
                lineTo(32.0f, 113.23f)
                close()
                moveTo(166.68f, 151.89f)
                arcTo(8.4f, 8.4f, 0.0f, false, false, 168.0f, 152.0f)
                arcToRelative(63.9f, 63.9f, 0.0f, false, false, 17.82f, -2.54f)
                lineToRelative(-23.0f, 50.54f)
                lineTo(144.0f, 200.0f)
                lineTo(144.0f, 148.11f)
                close()
            }
        }
        .build()
        return _hairdryer!!
    }

private var _hairdryer: ImageVector? = null
