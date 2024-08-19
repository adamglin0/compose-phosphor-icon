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

public val BoldGroup.Globehemisphereeast: ImageVector
    get() {
        if (_globehemisphereeast != null) {
            return _globehemisphereeast!!
        }
        _globehemisphereeast = Builder(name = "Globehemisphereeast", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(83.57f, 83.57f, 0.0f, false, true, 44.0f, 12.48f)
                verticalLineToRelative(16.0f)
                lineTo(151.79f, 96.0f)
                lineToRelative(-28.47f, 3.85f)
                lineTo(104.62f, 87.6f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.07f, 5.28f)
                lineToRelative(-20.94f, 31.3f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, false, -3.38f, 11.0f)
                lineToRelative(-0.16f, 28.69f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 128.0f, 44.0f)
                close()
                moveTo(68.41f, 187.14f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 76.0f, 171.55f)
                lineToRelative(0.2f, -35.0f)
                lineToRelative(18.07f, -27.0f)
                lineToRelative(16.62f, 10.88f)
                arcToRelative(19.92f, 19.92f, 0.0f, false, false, 14.14f, 3.42f)
                lineToRelative(31.47f, -4.26f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 169.0f, 112.79f)
                lineTo(191.16f, 87.0f)
                arcToRelative(20.15f, 20.15f, 0.0f, false, false, 4.39f, -8.9f)
                arcToRelative(83.78f, 83.78f, 0.0f, false, true, 14.12f, 69.48f)
                lineToRelative(-11.34f, -10.37f)
                arcToRelative(20.08f, 20.08f, 0.0f, false, false, -21.17f, -3.71f)
                lineToRelative(-30.45f, 12.66f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -12.11f, 15.55f)
                lineToRelative(-2.39f, 16.2f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 14.71f, 22.26f)
                lineToRelative(16.0f, 4.18f)
                arcToRelative(83.78f, 83.78f, 0.0f, false, true, -94.47f, -17.24f)
                close()
                moveTo(185.18f, 189.46f)
                lineTo(183.55f, 187.83f)
                arcToRelative(20.05f, 20.05f, 0.0f, false, false, -9.08f, -5.22f)
                lineToRelative(-18.0f, -4.72f)
                lineTo(158.0f, 167.48f)
                lineToRelative(26.0f, -10.81f)
                lineTo(200.0f, 171.26f)
                arcTo(84.84f, 84.84f, 0.0f, false, true, 185.18f, 189.46f)
                close()
            }
        }
        .build()
        return _globehemisphereeast!!
    }

private var _globehemisphereeast: ImageVector? = null
