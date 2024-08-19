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

public val ThinGroup.Personsimpletaichi: ImageVector
    get() {
        if (_personsimpletaichi != null) {
            return _personsimpletaichi!!
        }
        _personsimpletaichi = Builder(name = "Personsimpletaichi", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 76.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 128.0f, 76.0f)
                close()
                moveTo(128.0f, 28.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 28.0f)
                close()
                moveTo(220.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(132.0f, 108.0f)
                verticalLineToRelative(33.36f)
                lineToRelative(53.58f, 23.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 188.0f, 168.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(180.0f, 170.64f)
                lineToRelative(-51.22f, -22.0f)
                lineTo(50.68f, 219.0f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 45.32f, 213.0f)
                lineTo(124.0f, 142.22f)
                lineTo(124.0f, 108.0f)
                lineTo(40.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(216.0f, 100.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 104.0f)
                close()
            }
        }
        .build()
        return _personsimpletaichi!!
    }

private var _personsimpletaichi: ImageVector? = null
