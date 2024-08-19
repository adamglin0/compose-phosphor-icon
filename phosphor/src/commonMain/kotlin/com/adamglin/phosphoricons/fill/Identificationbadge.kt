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

public val FillGroup.Identificationbadge: ImageVector
    get() {
        if (_identificationbadge != null) {
            return _identificationbadge!!
        }
        _identificationbadge = Builder(name = "Identificationbadge", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 24.0f)
                close()
                moveTo(96.0f, 48.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(96.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                close()
                moveTo(180.81f, 198.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.21f, -1.6f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -83.2f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.8f, -9.6f)
                arcTo(67.88f, 67.88f, 0.0f, false, true, 101.0f, 165.51f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 53.94f, 0.0f)
                arcTo(67.88f, 67.88f, 0.0f, false, true, 182.4f, 187.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 180.81f, 198.4f)
                close()
                moveTo(152.0f, 136.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 152.0f, 136.0f)
                close()
            }
        }
        .build()
        return _identificationbadge!!
    }

private var _identificationbadge: ImageVector? = null
