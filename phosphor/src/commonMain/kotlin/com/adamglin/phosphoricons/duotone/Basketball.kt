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

public val DuotoneGroup.Basketball: ImageVector
    get() {
        if (_basketball != null) {
            return _basketball!!
        }
        _basketball = Builder(name = "Basketball", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(60.0f, 195.88f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.12f, 0.12f)
                close()
                moveTo(60.0f, 60.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(96.43f, 96.43f, 0.0f, false, false, 0.0f, 135.88f)
                arcToRelative(96.09f, 96.09f, 0.0f, false, false, 28.0f, -67.94f)
                arcTo(96.09f, 96.09f, 0.0f, false, false, 60.0f, 60.0f)
                close()
                moveTo(196.0f, 60.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(96.43f, 96.43f, 0.0f, false, false, 0.0f, 135.88f)
                arcTo(96.43f, 96.43f, 0.0f, false, false, 196.0f, 60.0f)
                close()
                moveTo(196.0f, 195.88f)
                lineTo(196.12f, 196.0f)
                lineTo(196.0f, 195.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(40.37f, 136.0f)
                lineTo(79.63f, 136.0f)
                arcTo(87.2f, 87.2f, 0.0f, false, true, 60.0f, 183.83f)
                arcTo(87.54f, 87.54f, 0.0f, false, true, 40.37f, 136.0f)
                close()
                moveTo(136.0f, 120.0f)
                lineTo(136.0f, 40.37f)
                arcToRelative(87.59f, 87.59f, 0.0f, false, true, 48.68f, 20.37f)
                arcTo(103.06f, 103.06f, 0.0f, false, false, 160.3f, 120.0f)
                close()
                moveTo(120.0f, 120.0f)
                lineTo(95.7f, 120.0f)
                arcTo(103.06f, 103.06f, 0.0f, false, false, 71.32f, 60.74f)
                arcTo(87.59f, 87.59f, 0.0f, false, true, 120.0f, 40.37f)
                close()
                moveTo(79.63f, 120.0f)
                lineTo(40.37f, 120.0f)
                arcTo(87.54f, 87.54f, 0.0f, false, true, 60.0f, 72.17f)
                arcTo(87.2f, 87.2f, 0.0f, false, true, 79.63f, 120.0f)
                close()
                moveTo(95.7f, 136.0f)
                lineTo(120.0f, 136.0f)
                verticalLineToRelative(79.63f)
                arcToRelative(87.59f, 87.59f, 0.0f, false, true, -48.68f, -20.37f)
                arcTo(103.09f, 103.09f, 0.0f, false, false, 95.7f, 136.0f)
                close()
                moveTo(136.0f, 136.0f)
                horizontalLineToRelative(24.3f)
                arcToRelative(103.09f, 103.09f, 0.0f, false, false, 24.38f, 59.26f)
                arcTo(87.59f, 87.59f, 0.0f, false, true, 136.0f, 215.63f)
                close()
                moveTo(176.37f, 136.0f)
                horizontalLineToRelative(39.26f)
                arcTo(87.54f, 87.54f, 0.0f, false, true, 196.0f, 183.83f)
                arcTo(87.2f, 87.2f, 0.0f, false, true, 176.37f, 136.0f)
                close()
                moveTo(176.37f, 120.0f)
                arcTo(87.2f, 87.2f, 0.0f, false, true, 196.0f, 72.17f)
                arcTo(87.54f, 87.54f, 0.0f, false, true, 215.63f, 120.0f)
                close()
            }
        }
        .build()
        return _basketball!!
    }

private var _basketball: ImageVector? = null
