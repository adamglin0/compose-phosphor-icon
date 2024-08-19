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

public val LightGroup.Currencyeth: ImageVector
    get() {
        if (_currencyeth != null) {
            return _currencyeth!!
        }
        _currencyeth = Builder(name = "Currencyeth", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.72f, 124.29f)
                lineToRelative(-88.0f, -112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.44f, 0.0f)
                lineToRelative(-88.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 7.42f)
                lineToRelative(88.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.44f, 0.0f)
                lineToRelative(88.0f, -112.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 220.72f, 124.29f)
                close()
                moveTo(134.0f, 33.35f)
                lineToRelative(72.56f, 92.35f)
                lineToRelative(-72.56f, 33.0f)
                close()
                moveTo(122.0f, 158.68f)
                lineToRelative(-72.56f, -33.0f)
                lineTo(122.0f, 33.35f)
                close()
                moveTo(122.0f, 171.86f)
                verticalLineToRelative(50.79f)
                lineToRelative(-62.08f, -79.0f)
                close()
                moveTo(134.0f, 171.86f)
                lineTo(196.08f, 143.65f)
                lineTo(134.0f, 222.65f)
                close()
            }
        }
        .build()
        return _currencyeth!!
    }

private var _currencyeth: ImageVector? = null
