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

public val DuotoneGroup.PersonSimpleSki: ImageVector
    get() {
        if (_personSimpleSki != null) {
            return _personSimpleSki!!
        }
        _personSimpleSki = Builder(name = "PersonSimpleSki", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 60.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 192.0f, 60.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 88.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 172.0f, 88.0f)
                close()
                moveTo(172.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 48.0f)
                close()
                moveTo(32.32f, 77.76f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.92f, -5.44f)
                lineTo(112.0f, 92.67f)
                lineToRelative(10.32f, -10.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineTo(163.31f, 112.0f)
                lineTo(200.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(160.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -2.34f)
                lineTo(148.73f, 120.0f)
                lineToRelative(-111.0f, -32.36f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.32f, 77.76f)
                close()
                moveTo(236.44f, 204.24f)
                arcToRelative(69.78f, 69.78f, 0.0f, false, true, -58.37f, 8.95f)
                lineTo(21.76f, 167.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 4.48f, -15.36f)
                lineToRelative(76.0f, 22.13f)
                lineTo(128.73f, 148.0f)
                lineTo(85.8f, 135.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.4f, -15.39f)
                lineToRelative(56.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.46f, 13.35f)
                lineToRelative(-29.9f, 29.9f)
                lineToRelative(62.79f, 18.28f)
                arcToRelative(53.78f, 53.78f, 0.0f, false, false, 45.0f, -6.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.88f, 13.31f)
                close()
            }
        }
        .build()
        return _personSimpleSki!!
    }

private var _personSimpleSki: ImageVector? = null
