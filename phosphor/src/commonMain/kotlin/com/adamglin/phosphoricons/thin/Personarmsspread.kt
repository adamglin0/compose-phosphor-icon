package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.PersonArmsSpread: ImageVector
    get() {
        if (_personArmsSpread != null) {
            return _personArmsSpread!!
        }
        _personArmsSpread = Builder(name = "PersonArmsSpread", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 68.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 128.0f, 68.0f)
                close()
                moveTo(128.0f, 20.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 20.0f)
                close()
                moveTo(227.6f, 88.57f)
                arcTo(15.7f, 15.7f, 0.0f, false, false, 212.0f, 76.0f)
                lineTo(44.0f, 76.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -6.7f, 30.52f)
                lineToRelative(0.06f, 0.0f)
                lineToRelative(53.89f, 23.73f)
                lineToRelative(-21.92f, 83.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.9f, 20.91f)
                arcTo(15.82f, 15.82f, 0.0f, false, false, 84.0f, 236.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 14.42f, -9.07f)
                lineTo(128.0f, 176.0f)
                lineToRelative(29.58f, 51.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 29.07f, -13.35f)
                lineToRelative(-21.92f, -83.3f)
                lineToRelative(54.0f, -23.76f)
                arcTo(15.69f, 15.69f, 0.0f, false, false, 227.6f, 88.57f)
                close()
                moveTo(215.39f, 99.23f)
                lineToRelative(-57.0f, 25.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.26f, 4.68f)
                lineTo(179.0f, 215.94f)
                arcToRelative(4.12f, 4.12f, 0.0f, false, false, 0.24f, 0.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.87f, 10.63f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.63f, -3.87f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.16f, -0.31f)
                lineTo(131.46f, 166.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.92f, 0.0f)
                lineTo(91.42f, 223.06f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.16f, 0.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -14.5f, -6.76f)
                arcToRelative(4.12f, 4.12f, 0.0f, false, false, 0.24f, -0.67f)
                lineTo(99.87f, 129.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.26f, -4.68f)
                lineToRelative(-57.0f, -25.09f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 44.0f, 84.0f)
                lineTo(212.0f, 84.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.41f, 15.23f)
                close()
            }
        }
        .build()
        return _personArmsSpread!!
    }

private var _personArmsSpread: ImageVector? = null
