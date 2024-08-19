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

public val BoldGroup.Testtube: ImageVector
    get() {
        if (_testtube != null) {
            return _testtube!!
        }
        _testtube = Builder(name = "Testtube", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.49f, 83.51f)
                lineToRelative(-60.0f, -60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(34.28f, 152.75f)
                arcToRelative(48.77f, 48.77f, 0.0f, false, false, 69.0f, 69.0f)
                lineTo(214.48f, 110.49f)
                lineToRelative(21.31f, -7.11f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.7f, -19.87f)
                close()
                moveTo(86.28f, 204.75f)
                arcToRelative(24.77f, 24.77f, 0.0f, false, true, -35.0f, -35.0f)
                lineToRelative(28.13f, -28.13f)
                curveToRelative(7.73f, -2.41f, 19.58f, -3.0f, 35.06f, 5.0f)
                arcToRelative(83.94f, 83.94f, 0.0f, false, false, 21.95f, 8.0f)
                close()
                moveTo(204.2f, 88.62f)
                arcToRelative(12.15f, 12.15f, 0.0f, false, false, -4.69f, 2.89f)
                lineToRelative(-38.89f, 38.9f)
                curveToRelative(-7.73f, 2.41f, -19.58f, 3.0f, -35.06f, -5.0f)
                arcToRelative(83.94f, 83.94f, 0.0f, false, false, -21.94f, -8.0f)
                lineTo(172.0f, 49.0f)
                lineToRelative(37.79f, 37.79f)
                close()
            }
        }
        .build()
        return _testtube!!
    }

private var _testtube: ImageVector? = null
