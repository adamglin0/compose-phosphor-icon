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

public val DuotoneGroup.Mousesimple: ImageVector
    get() {
        if (_mousesimple != null) {
            return _mousesimple!!
        }
        _mousesimple = Builder(name = "Mousesimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -56.0f, 56.0f)
                horizontalLineTo(112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -56.0f, -56.0f)
                verticalLineTo(80.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 56.0f, -56.0f)
                horizontalLineToRelative(32.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 200.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 16.0f)
                lineTo(112.0f, 16.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 48.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, 64.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, -64.0f)
                lineTo(208.0f, 80.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 144.0f, 16.0f)
                close()
                moveTo(192.0f, 176.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, 48.0f)
                lineTo(112.0f, 224.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, -48.0f)
                lineTo(64.0f, 80.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, 48.0f, -48.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, 48.0f, 48.0f)
                close()
                moveTo(136.0f, 64.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mousesimple!!
    }

private var _mousesimple: ImageVector? = null
