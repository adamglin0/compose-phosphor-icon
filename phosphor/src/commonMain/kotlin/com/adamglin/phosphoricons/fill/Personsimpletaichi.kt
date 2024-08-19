package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Personsimpletaichi: ImageVector
    get() {
        if (_personsimpletaichi != null) {
            return _personsimpletaichi!!
        }
        _personsimpletaichi = Builder(name = "Personsimpletaichi", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 48.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 48.0f)
                close()
                moveTo(216.0f, 96.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(28.44f)
                lineTo(42.65f, 210.05f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 53.35f, 222.0f)
                lineToRelative(76.2f, -68.58f)
                lineTo(176.0f, 173.28f)
                verticalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.85f, -7.35f)
                lineTo(136.0f, 138.72f)
                verticalLineTo(112.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _personsimpletaichi!!
    }

private var _personsimpletaichi: ImageVector? = null
