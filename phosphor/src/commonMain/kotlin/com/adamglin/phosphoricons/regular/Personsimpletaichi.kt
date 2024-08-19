package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Personsimpletaichi: ImageVector
    get() {
        if (_personsimpletaichi != null) {
            return _personsimpletaichi!!
        }
        _personsimpletaichi = Builder(name = "Personsimpletaichi", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 80.0f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 96.0f, 48.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 80.0f)
                close()
                moveTo(128.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 32.0f)
                close()
                moveTo(224.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(136.0f, 112.0f)
                verticalLineToRelative(26.72f)
                lineToRelative(51.15f, 21.93f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 192.0f, 168.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(176.0f, 173.28f)
                lineToRelative(-46.45f, -19.91f)
                lineTo(53.35f, 222.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -10.7f, -11.9f)
                lineTo(120.0f, 140.44f)
                lineTo(120.0f, 112.0f)
                lineTo(40.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(216.0f, 96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 104.0f)
                close()
            }
        }
        .build()
        return _personsimpletaichi!!
    }

private var _personsimpletaichi: ImageVector? = null
