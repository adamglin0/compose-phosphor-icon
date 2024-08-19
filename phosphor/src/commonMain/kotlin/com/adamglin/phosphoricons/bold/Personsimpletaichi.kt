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

public val BoldGroup.Personsimpletaichi: ImageVector
    get() {
        if (_personsimpletaichi != null) {
            return _personsimpletaichi!!
        }
        _personsimpletaichi = Builder(name = "Personsimpletaichi", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 84.0f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 92.0f, 48.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 84.0f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(228.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(140.0f, 120.0f)
                verticalLineToRelative(16.09f)
                lineTo(188.73f, 157.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 196.0f, 168.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(172.0f, 175.91f)
                lineToRelative(-41.67f, -17.86f)
                lineTo(56.0f, 224.92f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 207.08f)
                lineToRelative(76.0f, -68.42f)
                lineTo(116.0f, 120.0f)
                lineTo(40.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(216.0f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 108.0f)
                close()
            }
        }
        .build()
        return _personsimpletaichi!!
    }

private var _personsimpletaichi: ImageVector? = null
