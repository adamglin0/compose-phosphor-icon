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

public val DuotoneGroup.Medalmilitary: ImageVector
    get() {
        if (_medalmilitary != null) {
            return _medalmilitary!!
        }
        _medalmilitary = Builder(name = "Medalmilitary", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(168.0f, 192.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 168.0f, 192.0f)
                close()
                moveTo(207.0f, 48.0f)
                horizontalLineTo(168.0f)
                verticalLineToRelative(85.82f)
                lineToRelative(42.72f, -19.42f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 5.28f, -8.2f)
                verticalLineTo(57.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 207.0f, 48.0f)
                close()
                moveTo(88.0f, 48.0f)
                horizontalLineTo(49.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -9.0f, 9.0f)
                verticalLineToRelative(49.2f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 5.28f, 8.2f)
                lineTo(88.0f, 133.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.0f, 40.0f)
                lineTo(49.0f, 40.0f)
                arcTo(17.0f, 17.0f, 0.0f, false, false, 32.0f, 57.0f)
                verticalLineToRelative(49.21f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, 10.0f, 15.47f)
                lineToRelative(62.6f, 28.45f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 46.88f, 0.0f)
                lineTo(214.0f, 121.68f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, 10.0f, -15.47f)
                lineTo(224.0f, 57.0f)
                arcTo(17.0f, 17.0f, 0.0f, false, false, 207.0f, 40.0f)
                close()
                moveTo(160.0f, 56.0f)
                verticalLineToRelative(72.67f)
                lineToRelative(-32.0f, 14.54f)
                lineTo(96.0f, 128.67f)
                lineTo(96.0f, 56.0f)
                close()
                moveTo(48.0f, 106.21f)
                lineTo(48.0f, 57.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(80.0f, 56.0f)
                verticalLineToRelative(65.39f)
                lineTo(48.59f, 107.12f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 48.0f, 106.21f)
                close()
                moveTo(128.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 224.0f)
                close()
                moveTo(208.0f, 106.21f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.59f, 0.91f)
                lineTo(176.0f, 121.39f)
                lineTo(176.0f, 56.0f)
                horizontalLineToRelative(31.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _medalmilitary!!
    }

private var _medalmilitary: ImageVector? = null
